package org.intelligence.interfaces;

import org.intelligence.enums.StimulationModeEnum;

public interface NeuralNetwork {

	public abstract void train();

	public abstract void addNode();

	public abstract void removeNode();

	public abstract void getNodes();

	public abstract void getNodeCount();

	public abstract void getNeuronCount();

	public abstract StimulationModeEnum getMode();
	
	public abstract void setMode();

	public abstract void reset();

	public abstract void run();

}