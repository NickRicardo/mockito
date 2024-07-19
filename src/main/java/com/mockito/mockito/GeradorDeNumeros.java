package com.mockito.mockito;

public final class GeradorDeNumeros {

    private static SplittableRandom random = new SplittableRandom();

    private GeradorDeNumeros(){
    }

    public static List<Integer> geraNumerosAleatorios(int tamanhoLista) {
        return random.ints().boxed().limit(tamanhoLista).collect(Collectors.toList());
    }

    public static List<Integer> geraNumerosAleatorios() {
        return random.ints().boxed().limit(random.nextInt(10)).collect(Collectors.toList());
    }