package org.intelligence.model;

public class Neuron {

	private double error, output;
	private Connection[] inputConnections, outputConnections;
	
	public Neuron() {
		
	}

	public Neuron(double error, double output, Connection[] inputConnections,
			Connection[] outputConnections) {
		this.error = error;
		this.output = output;
		this.inputConnections = inputConnections;
		this.outputConnections = outputConnections;
	}

	public double getError() {
		return error;
	}

	public void setError(double error) {
		this.error = error;
	}

	public double getOutput() {
		return output;
	}

	public void setOutput(double output) {
		this.output = output;
	}

	public Connection[] getInputConnections() {
		return inputConnections;
	}

	public void setInputConnections(Connection[] inputConnections) {
		this.inputConnections = inputConnections;
	}

	public Connection[] getOutputConnections() {
		return outputConnections;
	}

	public void setOutputConnections(Connection[] outputConnections) {
		this.outputConnections = outputConnections;
	}

}
