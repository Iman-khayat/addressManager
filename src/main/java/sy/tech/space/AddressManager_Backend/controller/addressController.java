package sy.tech.space.AddressManager_Backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sy.tech.space.AddressManager_Backend.model.Address;
import sy.tech.space.AddressManager_Backend.service.AddressService;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/address")
public class addressController {

    private final AddressService addressService;

    @Autowired // the addressService will be created automatically
    public addressController(AddressService addressService) {
    this.addressService = addressService;
    }

    @GetMapping
    public List<Address> getAddresses(){
           return this.addressService.getAddresses();
    }


    @PostMapping
    public void addNewAddress(@RequestBody Address address){
        addressService.addNewAddress(address);
    }

    @DeleteMapping(path = "{addressId}")
    public void deleteAddress(@PathVariable("addressId") Long id){
        //TODO: complete the function...
    }


    // TODO:  @PutMapping is used to update an object


}
