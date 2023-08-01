
/**
 * Write a description of class MyArrayList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyArrayList<J>
{
    private int size;
    private J[] data;
    private int MAXELEMENTS = 100;

    public MyArrayList()
    {
        data = (J[])new Object[MAXELEMENTS];
        size = 0;
    }

    public void add(int index, J j)
    {
        if(index < 0 || index > size)
        {
            throw new IndexOutOfBoundsException
            ("Index: " + index + ", Size " + size);
        }

        for(int i = size - 1; i >= index; i--)
        {
            data[i + 1] = data[i];
        }

        data[index] = j;
        size++;
    }

    public boolean contains(Object j)
    {
        for(int k = 0; k < size; k++)
        {
            if(j.equals(data[k]))
            {
                return true;
            }
        }
        return false;
    }

    public J get(int index)
    {
        if(index < 0 || index >= size)
        {
            throw new IndexOutOfBoundsException
            ("Index: " + index + ", Size: " + size);
        }
        return data[index];
    }

    public J remove(int index)
    {
        if(index < 0 || index >= size)
        {
            throw new IndexOutOfBoundsException
            ("Index: " + index + ", Size: " + size);
        }

        J j = data[index];

        for(int i = index; i < size - 1; i++)
        {
            data[i] = data[i + 1];
        }

        data[size - 1] = null;
        size--;
        return j;
    }

    public String toString()
    {
        String results = "[";
        for(int n = 0; n < size; n++)
        {
            results += data[n];
            if(n < size - 1)
            {
                results += ", ";
            }
        }
        return results.toString() + "]";
    }

    public int size()
    {
        return size;
    }

    public boolean sortList()
    {
        J hold;

        for(int i = 0; i < size - 1; i++)
        {
            for(int m = 0; m < size - 1; m++)
            {
                if(((Comparable)data[m]).compareTo(data[m + 1]) > 0)
                {
                    hold = data[ m + 1];
                    data[m + 1] = data[m];
                    data[m] = hold;
                }
            }
        }
        return true;
    }

    public MyArrayList<Character> checkChar(String userWord)
    {
        boolean noMatch = false;
        MyArrayList<Character> results = new MyArrayList<>();

        for(int i = 0; i < 5; i++)
        {
            for(int j = 0; j < 5; j++)
            {
                if(((Comparable)userWord.charAt(i)).compareTo(this.data[j]) == 0)
                {
                    if(i == j)
                    {
                        results.add(i, 'A');
                        noMatch = false;
                        break;
                    }
                    else
                    {
                        results.add(i, 'B');
                        noMatch = false;
                        break;
                    }
                }
                else
                {
                    noMatch = true;
                }
            }

            if(noMatch == true)          
            {
                results.add(i, 'C');
            }
        }
        return results;
    }
    
    public boolean checkWin()
    {
        boolean result = false;
        
        for(int k = 0; k < 5; k++)
        {
            if(((Comparable)data[k]).compareTo('A') == 0)
            {
                result = true;
            }
            else
            {
                result = false;
                break;
            }
        }
        return result;
    }
}
