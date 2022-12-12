public class Family {
    
    private Person[] members;
    public Family(Person[] m) {
        members=m;
    }

    public int adults() {
        int count = 0;
        for (Person member : members) {
            if (member.getAge() >= 18) {
                count++;
            }
        }
        return count;
        }
       

    public static void main(String[] args) {
        Person[] familyMembers = new Person[]{new Person("John", 30), new Person("Jane", 25), new Person("Jimmy", 5)};
        Family myFamily = new Family(familyMembers);
        System.out.println(myFamily.adults()); 
    }

}

