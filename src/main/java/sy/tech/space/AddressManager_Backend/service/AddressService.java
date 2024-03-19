package sy.tech.space.AddressManager_Backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sy.tech.space.AddressManager_Backend.model.Address;
import sy.tech.space.AddressManager_Backend.repository.AddressRepository;

import java.util.List;

@Service // is a Bean and Service
public class AddressService {
   private final AddressRepository addressRepository;

   @Autowired
    public AddressService(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }


    public List<Address> getAddresses() {
        return addressRepository.findAll();
    }

    public void addNewAddress(Address address) {
        addressRepository.save(address);
    }
}
