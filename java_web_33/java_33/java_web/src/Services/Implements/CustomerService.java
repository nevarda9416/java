package Services.Implements;

import Models.Customer;
import Services.BaseService;

import java.util.ArrayList;
import java.util.List;

public class CustomerService implements BaseService<Customer> {
    List<Customer> customerList = new ArrayList<>();

    @Override
    public List<Customer> getAll() {
        return this.customerList;
    }

    @Override
    public boolean save(Customer customer) {
        customerList.add(customer);
        return true;
    }

    @Override
    public boolean update(Customer customer) {
        if (!this.customerList.isEmpty()) {
            for (int i = 0; i < this.customerList.size(); i++) {
                if (customer.getId() == customerList.get(i).getId()) {
                    customerList.get(i).setName(customer.getName());
                    customerList.get(i).setAddress(customer.getAddress());
                    customerList.get(i).setAge(customer.getAge());
                }
            }
        }
        return true;
    }

    @Override
    public boolean delete(int id) {
        for (int i = 0; i < this.customerList.size(); i++) {
            if (id == customerList.get(i).getId()) {
                customerList.remove(i);
            }
        }
        return true;
    }
}
