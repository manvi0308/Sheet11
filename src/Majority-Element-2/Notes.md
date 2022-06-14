## Efficient way to iterate through a Hash Map
``` 
for (Map.Entry<Integer, Integer> e : hmap.entrySet()) 
{
    if (e.getValue() > n / 3) 
        {
                answer.add(e.getKey());
        }
}
```