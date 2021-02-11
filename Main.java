public class InputFilterMinMax implements InputFilter
{
    private final int min;
    private final int max;
    private final UtilityListener utilityListener;

    public InputFilterMinMax(int min, int max,UtilityListener utilityListener)
    {
        this.min = min;
        this.max = max;
        this.utilityListener = utilityListener;
    }

    @Override
    public CharSequence filter(CharSequence source, int start, int end, Spanned dest, int dstart, int dend)
    {
        try
        {
            int input = Integer.parseInt(dest.toString() + source.toString());

            if (isInRange(min, max, input))
            {
                return null;
            }
            else
            {
                utilityListener.getItem("Value cannot exceed " + max);
            }
        }
        catch (NumberFormatException ignored)
        {
            utilityListener.getItem("NumberFormatException");
        }
        return "";
    }

    private boolean isInRange(int a, int b, int c)
    {
        return b > a ? c >= a && c <= b : c >= b && c <= a;
    }