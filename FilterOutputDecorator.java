public class FilterOutputDecorator extends OutputDecorator
{
    public FilterOutputDecorator(Output decoratedOutput)
    {
        super(decoratedOutput);
    }

    @Override public void write()
    {
        decoratedOutput.write();
    }
}