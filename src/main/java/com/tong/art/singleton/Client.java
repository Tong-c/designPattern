package com.tong.art.singleton;

public class Client {
    public static void main(String[] args) {
        LoadBalancer balancer1, balancer2, balancer3, balancer4;
        balancer1 = LoadBalancer.getLoadBalancer();
        balancer2 = LoadBalancer.getLoadBalancer();
        balancer3 = LoadBalancer.getLoadBalancer();
        balancer4 = LoadBalancer.getLoadBalancer();

        if (balancer1 == balancer2 && balancer2 == balancer3 && balancer3 == balancer4) {
            System.out.println("服務器負載均衡器具有唯一性");
        }

        balancer1.addServer("server 1");
        balancer1.addServer("server 2");
        balancer1.addServer("server 3");
        balancer1.addServer("server 4");

        for (int i = 0; i < 10; i++) {
            String server = balancer1.getServer();
            System.out.println("分發請求至服務器：" + server);
        }
    }
}
