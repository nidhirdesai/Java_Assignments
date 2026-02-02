package oopsprograms;

class ParameterizedConstructor {

    int id;      //Data Variable
    String name; //Data Variable

    // Parameterized Constructor
    ParameterizedConstructor(int i, String n) 
    {
        id = i;
        name = n;
    }

    void show() //Member Function
    {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {

        ParameterizedConstructor obj =new ParameterizedConstructor(101, "Rahul");

        obj.show();
    }
}
