package maplabs;

import org.apache.commons.lang3.builder.CompareToBuilder;

public class Cat implements Comparable<Cat>{
    
    private int catId;
    private String name;
    private int age;
    private Employee owner;
    
    
    public Cat(int catId, String name, int age, Employee owner) {
        this.catId = catId;
        this.name = name;
        this.age = age;
        this.owner = owner;
    }
    
    public Employee getOwner() {
        return owner;
    }

    public void setOwner(Employee owner) {
        this.owner = owner;
    }
    
    /**
     * Get the value of age
     *
     * @return the value of age
     */
    public int getAge() {
        return age;
    }

    /**
     * Set the value of age
     *
     * @param age new value of age
     */
    public void setAge(int age) {
        this.age = age;
    }
    
    /**
     * Get the value of name
     *
     * @return the value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the value of name
     *
     * @param name new value of name
     */
    public void setName(String name) {
        this.name = name;
    }

    
    /**
     * Get the value of catId
     *
     * @return the value of catId
     */
    public int getCatId() {
        return catId;
    }

    /**
     * Set the value of catId
     *
     * @param catId new value of catId
     */
    public void setCatId(int catId) {
        this.catId = catId;
    }

    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + this.catId;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cat other = (Cat) obj;
        if (this.catId != other.catId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Cat{" + "catId=" + catId + ", name=" + name + ", age=" + age + '}';
    }

    @Override
    public int compareTo(Cat o) {
        return new CompareToBuilder()
                .append(this.catId, o.catId)
                .toComparison();
    }
    
    

}
