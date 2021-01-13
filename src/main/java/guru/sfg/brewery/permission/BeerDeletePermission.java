package guru.sfg.brewery.permission;

import org.springframework.security.access.prepost.PreAuthorize;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by jt on 6/30/20.
 */
@Retention(RetentionPolicy.RUNTIME)
@PreAuthorize("hasAuthority('beer.delete')")
public @interface BeerDeletePermission {
}
