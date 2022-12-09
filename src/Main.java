import dataAccess.BrandDAO;
import dataAccess.CarDAO;

import java.lang.reflect.Array;
import java.util.ArrayList;


// Car class : Name isNew Brand double rengi

public class Main {
    public static void main(String[] args) throws  RuntimeException {

        CarDAO carDAO = new CarDAO();


        System.out.println( carDAO.getAll() );
    }
}