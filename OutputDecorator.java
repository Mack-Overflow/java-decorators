public abstract class OutputDecorator implements Output
{
    protected Output decoratedOutput;

    public OutputDecorator(Output decoratedOutput)
    {
        this.decoratedOutput = decoratedOutput;
    }

    public void write()
    {
        decoratedOutput.write();
    }
}