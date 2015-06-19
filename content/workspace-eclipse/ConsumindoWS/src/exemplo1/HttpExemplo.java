package exemplo1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

import org.json.JSONArray; 
import org.json.JSONObject;


/**
 *
 * @author marcelosiedler
 */
public class HttpExemplo {
 
	private final String USER_AGENT = "Mozilla/5.0";
 
	public static void main(String[] args) throws Exception {
		
		//String urlDetest = "http://localhost/fatec-curso/ws-lojacarros/";
		String urlAtual = "http://www.ws-lojacarro.hol.es/";
 
		HttpExemplo http = new HttpExemplo();
 
		System.out.println("## TESTE 1 - LISTAR CARROS (Todos)");
		String json = http.sendGet( urlAtual + "loja/getlist");
		System.out.println(json);
		
		System.out.println("\n\n### Listando em array");
		JSONObject jsono = new JSONObject(json);
		JSONArray recs = jsono.getJSONArray("data");		
		for (int i = 0; i < recs.length(); ++i) {
		    JSONObject rec = recs.getJSONObject(i);
		    int id = rec.getInt("id");		    
		    String nome = rec.getString("nome");
		    System.out.println("ID::: " + id + " NOME::: " + nome);
		}
		
		System.out.println("\n\n## TESTE 2 - ADICIONAR CARRO!"); 
		String json2 = http.sendGet( urlAtual + "loja/put?nome=Fusca%20Azulx&cor=vermelho&tipo=Luxo");
		System.out.println(json2); // {"return":true}
		JSONObject json2o = new JSONObject(json2);
		System.out.println(json2o.toString()); // {"return":true}
		System.out.println(json2o.get("return")); // true
		
		
		/* Gson g  = new Gson();*/  
 
		// System.out.println("\nTesting 2 - Send Http POST request");
		//http.sendPost();
		// http.sendPost("https://localhost/fatec-si-lojacarros/loja/put", "nome=Ferrari%20Black&cor=vermelho&tipo=Luxo");
		
 
	}
 
	// HTTP GET request
	private String sendGet(String url) throws Exception {
 
		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
 
		// optional default is GET
		con.setRequestMethod("GET");
 
		//add request header
		con.setRequestProperty("User-Agent", USER_AGENT);
 
		int responseCode = con.getResponseCode();
		System.out.println("\nSending 'GET' request to URL : " + url);
		System.out.println("Response Code : " + responseCode);
 
		BufferedReader in = new BufferedReader(
		        new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();
 
		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();
 
		//print result
		return response.toString();
 
	}
 
	// HTTP POST request
	private void sendPost(String url, String urlParameters) throws Exception {
		
		//String url = "https://selfsolve.apple.com/wcResults.do";
		URL obj = new URL(url);
		HttpsURLConnection con = (HttpsURLConnection) obj.openConnection();
 
		//add reuqest header
		con.setRequestMethod("POST");
		con.setRequestProperty("User-Agent", USER_AGENT);
		con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");
 
		//String urlParameters = "sn=C02G8416DRJM&cn=&locale=&caller=&num=12345";
 
		// Send post request
		con.setDoOutput(true);
		DataOutputStream wr = new DataOutputStream(con.getOutputStream());
		wr.writeBytes(urlParameters);
		wr.flush();
		wr.close();
 
		int responseCode = con.getResponseCode();
		System.out.println("\nSending 'POST' request to URL : " + url);
		System.out.println("Post parameters : " + urlParameters);
		System.out.println("Response Code : " + responseCode);
 
		BufferedReader in = new BufferedReader(
		        new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();
 
		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();
 
		//print result
		System.out.println(response.toString());
 
	}
 
}
