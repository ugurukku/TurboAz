package dataAccess;

import entity.Brand;
import entity.Car;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class BrandDAO implements BrandRepository {

    List<Brand> brands = Arrays.asList(new Brand(1, "Toyota"),
            new Brand(2, "Lada"));

    @Override
    public Brand getById(Integer id) {

        AtomicReference<Brand> _brand  = new AtomicReference<>();

        brands.forEach(brand -> {

            if (brand.getId() == id) {

                _brand.set(brand);

            }
        });

        return _brand.get();
    }

    @Override
    public void addBrand(Brand brand) {
        brands.add(brand);
    }

    @Override
    public List<Brand> getAll() {
        return brands;
    }
}
