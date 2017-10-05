package com.doctum.occ;

public class OperacaoComConjuntos
{
    
        public static boolean pertence(int elementoAPesquisar, int[] conjunto)
        {
        for (int elemento : conjunto)
        {
            if (elementoAPesquisar == elemento)
            {
                return true;
            }
        }
        
        return false;
        
        }
}