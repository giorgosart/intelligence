package org.intelligence.model;

public class Connection {

	private Neuron inputNeuron, outputNeuron;
	private Double weight;

	public Connection() {

	}

	public Connection(Neuron inputNeuron, Neuron outputNeuron, Double weight) {
		this.inputNeuron = inputNeuron;
		this.outputNeuron = outputNeuron;
		this.weight = weight;
	}

	public Neuron getInputNeuron() {
		return inputNeuron;
	}

	public void setInputNeuron(Neuron inputNeuron) {
		this.inputNeuron = inputNeuron;
	}

	public Neuron getOutputNeuron() {
		return outputNeuron;
	}

	public void setOutputNeuron(Neuron outputNeuron) {
		this.outputNeuron = outputNeuron;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

}
