package comp210.L01;

import comp210.L01.AccessModifiers.Fields;

// Subclass of Fields
public class AnotherClassExtender extends Fields {
    public AnotherClassExtender() {
        // refers to Fields constructor
        super();
        // can access protected field in subclass of different package
        int a = super.prot;
    }
}
