package com.Hique2605.Course.services;

import java.util.List;
import java.util.Optional;

import org.hibernate.sql.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Hique2605.Course.entities.User;
import com.Hique2605.Course.repositories.UserRepository;
import com.Hique2605.Course.services.exceptions.ResourceNotFoundException;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
		
	}
	
	public User findById(long id ) {
	Optional<User>	obj = repository.findById(id);
	return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}
	
	//cria user 
	public User insert(User obj) {
		return repository.save(obj);
	}
	
	//deleta user 
	public void delete(Long id) {
		repository.deleteById(id);
	}
	
	//update user 
		public User update(Long id, User obj) {
			User entity = repository.getReferenceById(id);
			updateData(entity, obj);
			return repository.save(entity);
		}
		
		//metodo que atualiza, nao deixa atualizar senha e id 
		private void updateData(User entity, User obj) {
			entity.setName(obj.getName());
			entity.setEmail(obj.getEmail());
			entity.setPhone(obj.getPhone());
		}
	
}
