abstract class person {
    //setters
    public abstract String getState();

    public abstract String getUsername();

    public abstract String getLastSignIn();

    public abstract String getLoginTime();

    public abstract int getPin();

    public abstract String getCity();

    public abstract int getZip();

    public abstract String getDateOfBirth();

    public abstract String getTotalPlayTime();
    
    //getters
    public abstract void setState(String state);

    public abstract void setLastSignIn(String lastSignIn);

    public abstract void setLoginTime(String loginTime);

    public abstract void setPin(int pin);

    public abstract void setCity(String city);

    public abstract void setZip(int zip);

    public abstract void setDateOfBirth(String dateOfBirth);

    public abstract void setTotalPlayTime(String l);

    public abstract String getPhoneNumber();

    public abstract String getAddress();

    public abstract int getBattlesWon();

    public abstract int getBattlesLost();

    public abstract int getGamesFinished();

    public abstract int getItemsPickedUp();

    public abstract void setPhoneNumber(String phoneNumber);

    public abstract void setAddress(String address);

    public abstract void addBattlesWon();

    public abstract void addBattlesLost();

    public abstract void addGamesFinished();

    public abstract void addItemsPickedUp();

    public abstract String getFirstName();

    public abstract String getLastName();
}
