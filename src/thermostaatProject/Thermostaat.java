package thermostaatProject;

public class Thermostaat
{
    private boolean operational;
    private boolean progActive;
    private double minTemp;
    private double maxTemp;
    private double curTemp;
    private double stepSize;
    private double nightTemp;
    private double dayTemp;

    Thermostaat()
    {
	this.operational = false;
	this.progActive = false;
	this.minTemp = 10;
	this.maxTemp = 30;
	this.curTemp = 20;
	this.stepSize = 1;
	this.nightTemp = 0;
	this.dayTemp = 0;
    }

    /**
     * @param operational
     * @param progActive
     * @param minTemp
     * @param maxTemp
     * @param curTemp
     * @param nightTemp
     * @param dayTemp
     */
    public Thermostaat(boolean operational, boolean progActive, double minTemp, double maxTemp, double curTemp,
	    double stepSize, double nightTemp, double dayTemp)
    {
	this.operational = operational;
	this.progActive = progActive;
	this.minTemp = minTemp;
	this.maxTemp = maxTemp;
	this.curTemp = curTemp;
	this.stepSize = stepSize;
	this.nightTemp = nightTemp;
	this.dayTemp = dayTemp;
    }

    /**
     * @return the operational
     */
    public boolean isOperational()
    {
	return operational;
    }

    /**
     * @param operational the operational to set
     */
    public void setOperational(boolean operational)
    {
	this.operational = operational;
    }

    /**
     * @return the progActive
     */
    public boolean isProgActive()
    {
	return progActive;
    }

    /**
     * @param progActive the progActive to set
     */
    public void setProgActive(boolean progActive)
    {
	this.progActive = progActive;
    }

    /**
     * @return the minTemp
     */
    public double getMinTemp()
    {
	return minTemp;
    }

    /**
     * @param minTemp the minTemp to set
     */
    public void setMinTemp(double minTemp)
    {
	this.minTemp = minTemp;
    }

    /**
     * @return the maxTemp
     */
    public double getMaxTemp()
    {
	return maxTemp;
    }

    /**
     * @param maxTemp the maxTemp to set
     */
    public void setMaxTemp(double maxTemp)
    {
	this.maxTemp = maxTemp;
    }

    /**
     * @return the curTemp
     */
    public double getCurTemp()
    {
	return curTemp;
    }

    /**
     * @param curTemp the curTemp to set
     */
    public void setCurTemp(double curTemp)
    {
	this.curTemp = curTemp;
    }

    /**
     * @return the stepSize
     */
    public double getStepSize()
    {
	return stepSize;
    }

    /**
     * @param stepSize the stepSize to set
     */
    public void setStepSize(double stepSize)
    {
	this.stepSize = stepSize;
    }

    /**
     * @return the nightTemp
     */
    public double getNightTemp()
    {
	return nightTemp;
    }

    /**
     * @param nightTemp the nightTemp to set
     */
    public void setNightTemp(double nightTemp)
    {
	this.nightTemp = nightTemp;
    }

    /**
     * @return the dayTemp
     */
    public double getDayTemp()
    {
	return dayTemp;
    }

    /**
     * @param dayTemp the dayTemp to set
     */
    public void setDayTemp(double dayTemp)
    {
	this.dayTemp = dayTemp;
    }

    @Override
    public String toString()
    {
	return "SETTINGS \n" + "Status thermostat: \t\t" + operational + "\n" + "Status program: \t\t" + progActive
		+ "\n" + "Min. temperture: \t\t" + minTemp + " °C \n" + "Max. temperture: \t\t" + maxTemp + " °C \n"
		+ "Current temperture: \t\t" + curTemp + " °C \n" + "Stepsize: \t\t\t" + stepSize + " °C \n"
		+ "Night temperture: \t\t" + nightTemp + " °C \n" + "Day temperture: \t\t" + dayTemp + " °C \n";
    }

}
