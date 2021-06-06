package com.company;

public class App {

    public static void main(String[] args) {
        Customers newUser = new Customers();
        newUser.setFirstName("Nari");
        newUser.setLastName("Louis");
        newUser.setEmail("nlouis@gmail.com");
        newUser.setPhoneNumber("615-555-6789");
        System.out.println(newUser);

        BillingAddress newUserBillingAddress = new BillingAddress();
        newUserBillingAddress.setBillingStreet1("Foster ave");
        newUserBillingAddress.setBillingCity("Nashville");
        newUserBillingAddress.setBillingState("TN");
        newUserBillingAddress.setBillingZip("37221");
        System.out.println(newUserBillingAddress);

        ShippingAddress newUserShippingAddress = new ShippingAddress();
        newUserShippingAddress.setShippingStreet1("Leeds Ln");
        newUserShippingAddress.setShippingCity("Cleveland");
        newUserShippingAddress.setShippingState("Ohio");
        newUserShippingAddress.setShippingZip("44102");
        System.out.println(newUserShippingAddress);

        RewardsMembers isRewardsMember = new RewardsMembers();
        boolean User1 = isRewardsMember.isRewardsMember();
        boolean User2 = isRewardsMember.isNotRewardMember();
        System.out.println(User1+"--> The user is a reward member");
        System.out.println(User2+"--> The user is not a reward member");

    }
}
