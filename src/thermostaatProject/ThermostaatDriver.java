package thermostaatProject;

import java.util.ArrayList; // ctr shift o import
import java.util.Scanner; // importeren van scanner

public class ThermostaatDriver
{

    static Scanner scan = new Scanner(System.in);
    static ArrayList<String> snapshot = new ArrayList<String>(); // array lijst
    static Thermostaat thermo = new Thermostaat(); // thermostaat lege
						   // gegevens

    public static void main(String[] args)
    {
	// TODO Auto-generated method stub

	boolean x = false;
	boolean prog = false;

	System.out.println("WELCOME!");
	System.out.println("1. Activate thermostat\n2. Deactivate thermostat");
	int in = scan.nextInt(); // antwoord word opgeslagen in int in

	if (in == 1)
	{
	    x = true;

	    thermo.setOperational(true);

//	    System.out.println("Set minimum temperture: ");
//	    double minimal = scan.nextDouble();
//
//	    System.out.println("Set maximum temperture: ");
//	    double maximal = scan.nextDouble();
//
//	    System.out.println("Set desirable temperture: ");
//	    double desirable = scan.nextInt();

//	    int current = (int) (Math.random() * (maximal - minimal + 1) + minimal);

//	    System.out.println("Set stepsize:\n1. 0.5 °C\n2. 1.0 °C");
//	    int step = scan.nextInt();

//	    if (step == 1)
//	    {
//		thermo.setStepSize(0.5);
//	    } else if (step == 2)
//	    {
//		thermo.setStepSize(1.0);
//	    }

//	    thermo.setMinTemp(minimal);
//	    thermo.setMaxTemp(maximal);
//	    thermo.setCurTemp(current);

	    System.out.println("SETTINGS");
	    System.out.println("Minimum temperture: \t" + thermo.getMinTemp() + " °C");
	    System.out.println("Maximum temperture: \t" + thermo.getMaxTemp() + " °C");
//	    System.out.println("Desirable temperture: \t" + desirable + " °C");
	    System.out.println("Stepsize: \t\t" + thermo.getStepSize() + " °C");
	    System.out.println("Current temperture: \t" + thermo.getCurTemp() + " °C\n");

	} else if (in == 2)
	{
	    System.out.println("Thermostat status: deactivated \n");
	    x = false;
	} else
	{
	    System.out.println("Input is not recognized! \n");
	}

	while (x)
	{
	    System.out.println("HOME");
	    System.out.println("Your current temperture is " + thermo.getCurTemp() + " °C.");
	    System.out.println(
		    "1. SETTINGS\n2. PROGRAM\n3. DEACTIVATE THERMOSTAT\n4. RESET\n5. SNAPSHOT\n6. CHANGE TEMPERTURE");

	    try
	    {
		int setting = scan.nextInt();

		switch (setting) // switch case statement voor settings
		{
		case 1:
		    System.out.println("SETTINGS");

		    System.out.println("Set minimum temperture: ");
		    double minimal = scan.nextDouble();

		    System.out.println("Set maximum temperture: ");
		    double maximal = scan.nextDouble();

		    System.out.println("Set desirable temperture: ");
		    double desirable = scan.nextInt();

		    int current = (int) (Math.random() * (maximal - minimal + 1) + minimal);

		    System.out.println("Set stepsize:\n1. 0.5 °C\n2. 1.0 °C");
		    int step = scan.nextInt();

		    if (step == 1)
		    {
			thermo.setStepSize(0.5);
		    } else if (step == 2)
		    {
			thermo.setStepSize(1.0);
		    }

		    System.out.println();

		    thermo.setMinTemp(minimal);
		    thermo.setMaxTemp(maximal);
		    thermo.setCurTemp(current);

		    System.out.println("SETTINGS");
		    System.out.println("Minimum temperture: \t" + thermo.getMinTemp() + " °C");
		    System.out.println("Maximum temperture: \t" + thermo.getMaxTemp() + " °C");
		    System.out.println("Desirable temperture: \t" + desirable + " °C");
		    System.out.println("Stepsize: \t\t" + thermo.getStepSize() + " °C");
		    System.out.println("Current temperture: \t" + thermo.getCurTemp() + " °C\n");
		    break;
		case 2:
		    System.out.println("DAY/NIGHT PROGRAM");
		    System.out.println("1. Activate program\n2. Deactivate program\n");
		    int program = scan.nextInt();

		    switch (program)
		    {
		    case 1:
			System.out.println("Set day temperture:");
			double day = scan.nextDouble();

			System.out.println("Set night temperture:");
			double night = scan.nextDouble();

			thermo.setDayTemp(day);
			thermo.setNightTemp(night);

			System.out.println("SETTINGS DAY/NIGHT PROGRAM");
			System.out.println("Day temperture: " + thermo.getDayTemp() + " °C");
			System.out.println("Night temperture: " + thermo.getNightTemp() + " °C");

			System.out.println("Program status: activated\n");
			prog = true;
			break;
		    case 2:
			System.out.println("Program status: deactivated\n");
			prog = false;
			break;
		    }
		    break;
		case 3:
		    System.out.println("Thermostat status: deactivated\n");
		    x = false;
		    break;
		case 4:
		    thermo.setProgActive(false);
		    thermo.setMinTemp(0);
		    thermo.setMaxTemp(0);
		    thermo.setCurTemp(0);
		    thermo.setStepSize(0);
		    thermo.setNightTemp(0);
		    thermo.setDayTemp(0);

		    System.out.println("RESET");
		    System.out.println("Minimum temperture: \t" + thermo.getMinTemp() + " °C");
		    System.out.println("Maximum temperture: \t" + thermo.getMaxTemp() + " °C");
		    System.out.println("Stepsize: \t\t" + thermo.getStepSize() + " °C");
		    System.out.println("Current temperture: \t" + thermo.getCurTemp() + " °C");
		    System.out.println("Thermostat status: reset");
		    System.out.println("Program status: deactive\n");
		    break;
		case 5:
		    System.out.println("SNAPSHOT");
		    System.out.println("1. Make snapshot\n2. Snapshot history\n");
		    int snap = scan.nextInt();

		    if (snap == 1)
		    {
			snapAdd();
		    }
		    if (snap == 2)
		    {
			snapHis();
		    }
		    break;
		case 6:
		    changeTemp(); // voer functie uit changeTemp
		    break;
		}

	    } catch (Exception error)
	    {
		System.out.println("Wrong data imput! Back to main menu.\n");
		scan.nextLine();
	    }

	}
    }

    public static void snapAdd() // voeg snapshot toe
    {
	if (snapshot.size() != 10) // als size is niet 10
	{
	    snapshot.add(thermo.toString());
	    return; // gaat uit deze functie
	}

	if (snapshot.size() == 10) // als size is 10
	{
	    snapshot.remove(0); // remove eerste index (is 0)
	    snapshot.add(thermo.toString()); // voeg nieuwe snapshot toe op eerste vrije index in lijst
	    return;
	}
    }

    public static void snapHis()
    {
	for (int i = 0; i < snapshot.size(); i++)
	{
	    System.out.println(snapshot.get(i)); // laat snapshot historie zien
	}
    }

    public static double clamp(double var, double min, double max) // functie minimale/maximale waarde
    {
	if (var >= max) // is gelijk of groter dan max
	{
	    return var = max; // variable als max
	}

	if (var <= min) // is gelijk of kleiner dan min
	{
	    return var = min; // variable als min
	}

	return var;
    }

    public static void changeTemp()
    {
	double curTemp = scan.nextDouble();

	// check of je hoger/lager hebt ingevoerd
	if (curTemp > thermo.getMaxTemp())
	    System.out.println("Input is higher than maximum! Temperture changed to max.\n");
	if (curTemp < thermo.getMinTemp())
	    System.out.println("Input is lower than minimum! Temperture changed to min.\n");

	thermo.setCurTemp(curTemp = clamp(curTemp, thermo.getMinTemp(), thermo.getMaxTemp()));
	return; // niet nodig, maar staat cool
    }
}
