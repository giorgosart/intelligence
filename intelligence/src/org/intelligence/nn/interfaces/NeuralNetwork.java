package org.intelligence.nn.interfaces;

import org.intelligence.nn.enums.StimulationModeEnum;

public interface NeuralNetwork {

	public abstract void train();

	public abstract void addNode();

	public abstract void removeNode();

	public abstract void getNodes();

	public abstract void getNodeCount();

	public abstract void getNeuronCount();

	public abstract StimulationModeEnum getStimulationMode();

	public abstract void getMode();

	public abstract void setMode();

	public abstract void getTrainingType();

	public abstract void setTrainingType();

	public abstract void reset();

	public abstract void run();

}