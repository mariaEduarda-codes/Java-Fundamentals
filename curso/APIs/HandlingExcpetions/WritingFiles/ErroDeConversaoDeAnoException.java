package curso.APIs.HandlingExcpetions.WritingFiles;

//Se extendermos de Throwable, geraremos uma exceção que DEVE ser tratada com um bloco try-catch
//Nesse caso extenderemos de RunTimeException
public class ErroDeConversaoDeAnoException extends RuntimeException {
    private String mensagem;
    public ErroDeConversaoDeAnoException(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
