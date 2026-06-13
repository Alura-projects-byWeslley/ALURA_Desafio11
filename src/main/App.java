package main;

import models.Pessoa;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.Strictness;


public class App {
    public static void main(String[] args) throws Exception {
        String json = """
                {
                "nome":"weslley",
                "idade":30,
                "cidade":"Santos"
                }
                """;

        Gson gson = new GsonBuilder().setStrictness(Strictness.LENIENT).create();

        Pessoa pessoa = gson.fromJson(json, Pessoa.class);
        System.out.println(pessoa);

    }
}
