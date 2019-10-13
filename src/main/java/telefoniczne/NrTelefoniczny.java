package telefoniczne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class NrTelefoniczny implements Comparable<NrTelefoniczny> {
    private String nrKierunkowy;
    private String nrTelefonu;


    @Override
    public int compareTo(NrTelefoniczny nrTelefoniczny) {
        return this.nrTelefonu.compareTo(nrTelefoniczny.nrTelefonu);
    }
}
