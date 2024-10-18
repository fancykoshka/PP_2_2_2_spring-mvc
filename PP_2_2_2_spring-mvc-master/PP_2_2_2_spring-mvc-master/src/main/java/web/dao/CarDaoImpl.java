package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao {
    private static final List<Car> carList = new ArrayList<>();

    static {
        carList.add(new Car("Geely Monjaro", "black", 2024, 4695000));
        carList.add(new Car("Haval F7", "blue", 2024, 2599000));
        carList.add(new Car("Changan Uni-K", "blue", 2024, 4070000));
        carList.add(new Car("Jetour Dashing", "black", 2024, 2979900));
        carList.add(new Car("TANK 500", "black", 2024, 7099000));
        carList.add(new Car("Li Auto L9", "white", 2024, 10000000));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count == 0) {
            return carList;
        }

        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
