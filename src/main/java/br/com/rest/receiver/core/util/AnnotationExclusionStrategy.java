package br.com.rest.receiver.core.util;

import java.util.ArrayList;
import java.util.List;
import java.lang.annotation.Annotation;
import com.google.gson.ExclusionStrategy; 
import com.google.gson.FieldAttributes;

public class AnnotationExclusionStrategy implements ExclusionStrategy {

    @Override
    public boolean shouldSkipField(FieldAttributes fa) {
        String a = fa.getDeclaredClass().toString();
        String b = List.class.toString();

        List<Annotation> anotacoes = new ArrayList<Annotation>(fa.getAnnotations());
        for (int i = 0; i < anotacoes.size(); i++) {
            String an = anotacoes.get(i).toString();
            if(an.contains("javax.persistence.OneToMany") && a.equals(b)){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean shouldSkipClass(Class<?> clazz) {
        return false;//clazz == List.class;
    }

}