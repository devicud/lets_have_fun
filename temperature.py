def temperature_measurement(temperature,mesurement):
	fahrenheit_checker = "f"
	celsius_checker = "c"
	if fahrenheit_checker in measurement:
		celcius = float((temperature-32)*(5/9))
		if celcius>=50:
			return "Heat alert!!!"
		else:
			return "Cold advisory!!!"
	elif celsius_checker in measurement or mesurement == "":
		fahrenheit = float((temperature*(9/5)) + 32)
		if fahrenheit>=50:
			return "Heat alert!!!"
		else:
			return "cold advisory!!!"
	else:
	    return"Invalid input"
			
temperature = float(input("Enter the temperature: "))
measurement = input("Enter Measurement value (c or f): ")
result = temperature_measurement(temperature,measurement)
print(result)
