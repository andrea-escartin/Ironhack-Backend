public class LogInUser {
    private String username;
    private final String password;
    private boolean blocked;
    private final int maxAttempts;

    // Constructor
    public LogInUser(String username, String password, int maxAttempts){
        this.username = username;
        this.password = password;
        this.maxAttempts = maxAttempts;
    }

    // Getters and Setters
    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    // public String getPassword() {
    //     return this.password;
    // }

    public int getMaxAttempts(){
        return this.maxAttempts;
    }

    public boolean isBlocked() {
        return this.blocked;
    }

    public boolean getBlocked() {
        return this.blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    // Methods
    public boolean attemptLogIN(String userPWD, int attempt){
        if (this.blocked){
            System.out.println("Too many attempts. This user is blocked");
            return false;
        }

        if (this.password.equals(userPWD)) {
            System.out.println("Successful login :)");
            return true;
        }
        else {
            System.out.println("Upss wrong password");
        }
        
        if (attempt>=this.maxAttempts) {
            this.blocked = true;
            System.out.println("Too many failed attempts... Blocking user");
        }
        
        return false;
    }

    //toString

    @Override
    public String toString() {
        return "{" +
            " username='" + getUsername() + "'" +
            // ", password='" + getPassword() + "'" +
            ", password='" + "****" + "'" +
            ", blocked='" + isBlocked() + "'" +
            "}";
    }



}
