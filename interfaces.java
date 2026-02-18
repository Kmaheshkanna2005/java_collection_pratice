interface inter{
    void f1_car();
    void gt3_car();
}

class cars implements inter
{
    public void f1_car()
    {
        System.out.println("the f1 car is fastest");
    }
    public void gt3_car()
    {
        System.out.println("the gt3 car has many racing setups");
    }
}

class interfaces
{
    public static void main(String[] args) {
        cars c = new cars();
        c.f1_car();
        c.gt3_car();
    }
}