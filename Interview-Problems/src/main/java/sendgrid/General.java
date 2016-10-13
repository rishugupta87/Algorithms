package sendgrid;

import java.util.*;

public class General {
        public static void main(String[] args) {
            List<UserService> services = new ArrayList<UserService>();
            Map<String, UserService> serviceLookup = new HashMap<String, UserService>();
            Scanner scanner = new Scanner(System.in);
            int commands = scanner.nextInt();
            String serviceName, userName, serviceName1, serviceName2;
            int userId;
            UserService us, service1, service2;
            for (int c = 0; c < commands; c++) {
                    String command = scanner.next();
                    if(command.equals("add")) {
                        serviceName = scanner.next();
                        userName = scanner.next();
                        userId = scanner.nextInt();
                        us = serviceLookup.get(serviceName);
                        us.addUser(new User(userName, userId));
                    } else if(command.equals("delete")){
                        serviceName = scanner.next();
                        userName = scanner.next();
                        userId = scanner.nextInt();
                        us = serviceLookup.get(serviceName);
                        us.deleteUser(new User(userName, userId));
                    }
                    else if(command.equals("service")){
                        serviceName = scanner.next();
                        us = new UserService(serviceName);
                        services.add(us);
                        serviceLookup.put(serviceName, us);
                    }
                    else if(command.equals("register")){
                        serviceName1 = scanner.next();
                        serviceName2 = scanner.next();
                        service1 = serviceLookup.get(serviceName1);
                        service2 = serviceLookup.get(serviceName2);
                        service1.registerListener(service2);
                    }
                    else if(command.equals("deregister")){
                        serviceName1 = scanner.next();
                        serviceName2 = scanner.next();
                        service1 = serviceLookup.get(serviceName1);
                        service2 = serviceLookup.get(serviceName2);
                        service1.deregisterListener(service2);
                    }
                }
            for (UserService s : services) {
                System.out.println("service " + s);
                for (User u : s.getUsers()) {
                    System.out.println(u);
                }
            }
        }
}
