public interface ISanitization {
    Outputs sanitize(Inputs request);
    void setNext(ISanitization sanitizer);
}
