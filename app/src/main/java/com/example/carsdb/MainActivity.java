package com.example.carsdb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.List;

import Data.DatabaseHandler;
import Model.Car;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DatabaseHandler databaseHandler = new DatabaseHandler(this);
        Log.d("CarsCount:", String.valueOf(databaseHandler.getCarsCount()));

        /*databaseHandler.addCar(new Car("Toyota", "30000$"));
        databaseHandler.addCar(new Car("Opel", "25000$"));
        databaseHandler.addCar(new Car("Mercedes", "50000$"));
        databaseHandler.addCar(new Car("Kia", "28000$"));*/

        List<Car> carList = databaseHandler.getAllCars();


        Car deletingCar = databaseHandler.getCar(7);
        databaseHandler.deleteCar(deletingCar);

        for(Car car : carList) {
            Log.d("Car info: ", "ID " + car.getId() + ", name " + car.getName() + ", price" + car.getPrice());
        }

        /*Car car = databaseHandler.getCar(1);

        car.setName("Tesle");
        car.setPrice("50000$");

        databaseHandler.updateCar(car);
        Log.d("Car info: ", "ID " + car.getId() + ", name " + car.getName() + ", price" + car.getPrice());*/
    }


}
