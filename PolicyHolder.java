/*
   Brandon Tegey
   04/24/2023
   This class holds all the information provided by the user input into the program about a 
   policy holder of an insurance policy.
*/
public class PolicyHolder {
   
   private int holderAge;
   
   private double holderWeight,
                  holderHeight;
   
   private String providerName,
                  holderFirstName,
                  holderLastName,
                  smokingStatus;
                  
   /**
      Constructor that reads in the users input values to then assign and inistalize the class fields.
      @param firstName The first name of the policy holder input by the user and read into the program as a String.
      @param lastName The last name of the polocy holder input by the user and read into the prorgram as a String.
      @param age The age of the policy holder input into by the user and read into the program as a int.
      @param smoking The smoking status of the policy holder input by the user and read into the proram as a String.
      @param height The height of the policy holder input by the user and read into the program as a double.
      @param weight The weight of the policy holder input by the user and read into the program as a double.
   */               
   public PolicyHolder(String firstName, String lastName, int age, String smoking,
                 double height, double weight) {
      
      holderAge = age;
      holderWeight = weight;
      holderHeight = height;
      holderFirstName = firstName;
      holderLastName = lastName;
      smokingStatus = smoking;       
   }// End of constructor.
   
   /**
      A copy constructor that makes a copy of the PolicyHolder class and passes it as a parameter.
      This will be used to avoid security holes.
      @param object2 The object to copy.
   */
   public PolicyHolder(PolicyHolder object2) {
      
      holderAge = object2.holderAge;
      holderWeight = object2.holderWeight;
      holderHeight = object2.holderHeight;
      holderFirstName = object2.holderFirstName;
      holderLastName = object2.holderLastName;
      smokingStatus = object2.smokingStatus;
   }// End of constructor.
   
   /**
      SETTER METHODS - BEGIN
   */
   
   /**
      Instance method that sets the first name of the policy holder based on the value that was read into the program.
      @param firstName The first name of the policy holder input by the user and read into the program as a String.
   */
   public void setFirstName(String firstName) {
      
      holderFirstName = firstName;   
   }// End of instance method.
   
   /**
      Instance method that sets the last name of the policy holder based on the value that was read into the program.
      @param lastName The last name of the policy holder input by the user and read into the program as a String.
   */
   public void setLastName(String lastName) {
   
      holderLastName = lastName;
   }// End of instance method.
   
   /**
      Instance method that sets the age of the policy holder based on the value that was read into the program.
      @param age The age of the policy holder input into by the user and read into the program as a int.
   */
   public void setAge(int age) {
      
      holderAge = age;
   }// End of instance method.
   
   /**
      Instance method that sets the smoking status of the policy holder based on the value that was read into the program.
      @param smoking The smoking status of the policy holder input by the user and read into the proram as a String.
   */
   public void setSmokingStatus(String smoking) {
      
      smokingStatus = smoking;
   }//End of instance method.
   
   /**
      Instance method that sets the height of the policy holder based on the value that was read into the program.
      @param height The height of the policy holder input by the user and read into the program as a double.
   */
   public void setHeight(double height) {
      
      holderHeight = height;
   }// End of instance method.
   
   /**
      Instance method that sets the weight of the policy holder based on the value that was read into the program.
      @param weight The weight of the policy holder input by the user and read into the program as a double.
   */
   public void setWeight(double weight) {
   
      holderWeight = weight;
   }// End of instance method.

   /**
      GETTER METHODS - BEGIN
   */
   
   /**
       Instance method that returns the first name of the policy holder.
       @return holderFirstName The policy holder first name read into the program returned from the method.
   */
   public String getFirstName() {
      
      return holderFirstName;
   }// End of instance method.
   
   /**
       Instance method that returns the last name of the policy holder.
       @return holderLastName The policy holder last name read into the program returned from the method.
   */
   public String getLastName() {
      
      return holderLastName;
   }// End of instance method.

   /**
       Instance method that returns the age of the policy holder.
       @return holderAge The policy holder last name read into the program returned from the method.
   */
   public int getAge() {
   
      return holderAge;
   }
   
   /**
       Instance method that returns the smoking status of the policy holder.
       @return smokingStatus The policy holder smoking status read into the program returned from the method.
   */
   public String getSmokingStatus() {
      
      return smokingStatus;
   }// End of instance method.
   
   /**
       Instance method that returns the height of the policy holder.
       @return holderHeight The height of the policy holder read into the program returned from the method.
   */
   public double getHeight() {
      
      return holderHeight;
   }
   
   /**
       Instance method that returns the weight of the policy holder.
       @return holderWeight The weight of the policy holder read into the program returned from the method.
   */
   public double getWeight() {
      
      return holderWeight;
   }// End of instance method.
   
   /**
       Instance method that calculates the BMI of the user based on the input values from the user.
       @return bmi The bmi of the policy holder read into the program returned from the method.
   */
   public double calculateBmi() {
      
      // Local Variable Declared and Inistalized.
      double bmi = 0.0;
       
      // Calcualation of the bmi through the use of the other instance methods.
      bmi = (getWeight() * 703)/(Math.pow(getHeight(), 2));
      
      return bmi;
   }// End of instance method.
   
   /**
      Instance method that returns the policy holder inforamtion formmated as a string.
      @return A string containing the policy holder information
   */
   public String toString() {
      
      return String.format("Policyholder First Name: " + getFirstName() + 
                           "\nPolicyholder Last Name: " + getLastName() +
                           "\nPolicyholder Age: " + getAge() +
                           "\nPolicyholder Smoking Status: " + getSmokingStatus() +
                           "\nPolicyholder Height: " + getHeight() +
                           "\nPolicyholder Weight: " + getWeight() +
                           "\nPolicyholder BMI: %.2f\n", calculateBmi());
   }// End of instance method.
}// End of class.