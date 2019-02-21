/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise;

/**
 *
 * @author Sheryl Dreyer
 */
public class NewClassForMainMethod {

    public static void main(String[] args) {
        Customer cust1 = new Customer();
        Customer cust2 = new Customer();

        cust1.age = 40;
        cust2.name = "Duke";
        cust1.dispayCustomer();
        cust2.dispayCustomer();
    }

}
