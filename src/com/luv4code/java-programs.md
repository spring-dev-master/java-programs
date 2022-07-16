    
### Write a java8 code for whose array of numbers are started with 1
    
    List<Integer> list = Arrays.asList(12,30,14,5,1,111,52,11);
    list.stream().sorted().map(s -> s + "").filter(s -> s.startsWith("1")).forEach(System.out::println);

### Reverse a number
    
    int number = 5672;
    int reverse = 0;
    while(number != 0){
        int remainder = number % 10;
        reverse = reverse * 10  + remainder;
        number = number / 10;
    }

    System.out.println(reverse);
    
    
    