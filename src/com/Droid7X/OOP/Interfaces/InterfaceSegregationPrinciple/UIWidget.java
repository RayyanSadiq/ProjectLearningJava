package com.Droid7X.OOP.Interfaces.InterfaceSegregationPrinciple;

public interface UIWidget extends Draggable, Resizable { // This inherits methods from interface Resizable and Draggable
    // We should only separate interface methods when they have different capabilities, for example bark and barkLouder
    // have basically the same capability, so they should stay in the same interface.

    void render();
}

