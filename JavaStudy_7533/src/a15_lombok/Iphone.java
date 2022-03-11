package a15_lombok;

import java.time.LocalDateTime;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
//@Getter
//@Setter
//@ToString
//@EqualsAndHashCode
@Data
public class Iphone {
	private int series;
	private String model;
	private String color;
	private int momorySize;
	private int releaseYear;
	
	
	
	
}
