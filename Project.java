public class Project {

            //variables
            public String name;
            public String description;

    
    public Project(String name, String description){
        this.name = name;
        this.description = description;
    }


    public String elevatorPitch(){
        String details= String.format("\n Name: %s \n Description: %s", this.name, this.description);
        return details;
    }

}
