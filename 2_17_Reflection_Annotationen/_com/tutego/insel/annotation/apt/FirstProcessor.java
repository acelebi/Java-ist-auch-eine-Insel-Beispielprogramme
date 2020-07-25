package _com.tutego.insel.annotation.apt;

import java.util.Set;

import javax.annotation.processing.*;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.TypeElement;
import javax.tools.Diagnostic.Kind;

@SupportedAnnotationTypes( "*" )
@SupportedSourceVersion( SourceVersion.RELEASE_6 )
public class FirstProcessor extends AbstractProcessor
{
  @Override
  public boolean process( Set<? extends TypeElement> annotations,
                          RoundEnvironment roundEnv )
  {
    String msg = String.format( "%n %s%n %s",
                                roundEnv.toString(), annotations.toString() );
    processingEnv.getMessager().printMessage( Kind.NOTE, msg );         

    return false;
  }
}
