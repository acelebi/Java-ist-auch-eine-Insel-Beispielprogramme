package _com.tutego.insel.annotation.apt;

import java.util.Set;
import javax.annotation.processing.*;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.TypeElement;
import javax.tools.Diagnostic.Kind;

@SupportedAnnotationTypes( "com.tutego.insel.annotation.apt.javax.persistence.Entity" )
@SupportedSourceVersion( SourceVersion.RELEASE_6 )
public class CheckEntityBeansForDefaultConstructorProcessor extends AbstractProcessor
{
  @Override
  public boolean process( Set< ? extends TypeElement> annotations,
                          RoundEnvironment roundEnv )
  {
    if ( ! roundEnv.processingOver() )
      for ( Element element : roundEnv.getRootElements() )
      {
        boolean foundDefaultContructor = false;

        for ( Element ee : element.getEnclosedElements() )
          if ( ee instanceof ExecutableElement )
          {
            if (    "<init>".equals( ((ExecutableElement) ee).getSimpleName().toString() )
                 && ((ExecutableElement) ee).getParameters().isEmpty() )
              foundDefaultContructor = true;
          }

        if ( ! foundDefaultContructor )
          processingEnv.getMessager().printMessage( Kind.ERROR,
            element.getSimpleName() + " hat keinen Standardkonstruktor!" );
      }

    return false;
  }
}
