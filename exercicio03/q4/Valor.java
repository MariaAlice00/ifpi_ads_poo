/* Dado o seguinte trecho de código de acumulação de um atributo valor, explique a problemática envolvida e reescreva o método com uma solução: */

void x(double valor) {
    valor = valor + valor;
}

/*Há uma confusão na compreensão do código, pois atributo e parâmetro tem mesmo nome. A palavra reservada this (uma instância) permite acessar os atributos da própria  
instância. */
