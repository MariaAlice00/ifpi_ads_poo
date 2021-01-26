/* 
Dado o seguinte trecho de código de acumulação de um atributo valor, explique a problemática envolvida e reescreva o método com uma solução: 
void x(double valor) {
    valor = valor + valor;
}
*/

// Solução
void x(double valor) {
    valor = valor + valor;
}

/* No código colocado pela questão, há uma confusão na compreensão do código, pois atributo e parâmetro tem mesmo nome. 
Na solução é colocada a palavra reservada this (uma instância) que permite acessar os atributos da própria instância. */
