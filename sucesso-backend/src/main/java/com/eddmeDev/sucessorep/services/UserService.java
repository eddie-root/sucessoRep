package com.eddmeDev.sucessorep.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.eddmeDev.sucessorep.dto.RoleDTO;
import com.eddmeDev.sucessorep.dto.UserDTO;
import com.eddmeDev.sucessorep.entities.Role;
import com.eddmeDev.sucessorep.entities.User;
import com.eddmeDev.sucessorep.repositories.RoleRepository;
import com.eddmeDev.sucessorep.repositories.UserRepository;



@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	@Autowired
	private RoleRepository roleRepository;
	
	@Transactional(readOnly = true)
	public Page<UserDTO> findAll(Pageable pageable) {
		Page<User> list = repository.findAll(pageable);
		return list.map(x -> new UserDTO(x));
	}

	@Transactional(readOnly = true)
	public UserDTO findById(Long id) {
		Optional<User> obj = repository.findById(id);
		User entity = obj.orElseThrow();
		return new UserDTO(entity);
	}

	@Transactional
	public UserDTO insert(UserDTO dto) {
		User entity = new User();
		copyDtoToEntity(dto, entity);
		entity = repository.save(entity);
		return new UserDTO(entity);
	}
	
	private void copyDtoToEntity(UserDTO dto, User entity) {
		
		entity.setName(dto.getName());
		entity.setEmail(dto.getEmail());
		
		entity.getRoles().clear();
		for(RoleDTO roleDto : dto.getRoles()) {
			Role role = roleRepository.getReferenceById(roleDto.getId());
			entity.getRoles().add(role);
		}
	}

	@Transactional
	public UserDTO update(Long id, UserDTO dto) {
		User entity = repository.getReferenceById(id);
		copyDtoToEntity(dto, entity);
		entity = repository.save(entity);
		return new UserDTO(entity);
	}

	public void delete(Long id) {
		repository.deleteById(id);
		
	}
	
	
}
