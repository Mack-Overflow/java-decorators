public class BracketOutputDecorator extends OutputDecorator
{
    public BracketOutputDecorator(Output decoratedOutput)
    {
        super(decoratedOutput);
    }

    @Override public void write()
    {
        decoratedOutput.write();
        // methodSpecificToBracketOutputDecorator();

    }
}