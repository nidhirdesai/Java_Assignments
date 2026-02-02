package oopsprograms;

class CopyConstructor { //Class

    int id;   //Data Variables
    String name;

    // Parameterized Constructor
    CopyConstructor(int i, String n) 
    {
        id = i;
        name = n;
    }

    // Copy Constructor
    CopyConstructor(CopyConstructor obj) 
    {
        id = obj.id;
        name = obj.name;
    }

    void show()
    {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {

        // First Object
  CopyConstructor obj1 = new CopyConstructor(101, "Rahul");

        // Copying obj1 into obj2
        CopyConstructor obj2 =  new CopyConstructor(obj1);

        // Display both objects
        obj1.show();
        obj2.show();
    }
}
