package io.mcore.myapp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.security.access.prepost.PreAuthorize;

import io.mcore.myapp.model.Vehicle;

@RepositoryRestResource(collectionResourceRel = "vehicles", path = "vehicles")
public interface VehicleRepository extends MongoRepository<Vehicle, String> {

	public Vehicle findByPlateNumber(@Param("plate")String plateNumber);
	
	@Override
	@PreAuthorize("hasRole('ADMIN')")
	public <S extends Vehicle> S save(S arg0);

	@Override
	@RestResource(exported = true)
	//Expose DELETE verb (exported = false) to avoid it
	public void delete(Vehicle t);

}