package jp.co.yamaha_motor.hdeg.common.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import jp.co.yamaha_motor.hdeg.common.entity.ViewBaseEntity;

import java.util.List;

/**
 * マスタView共通リポジトリ（読み取り専用）
 *
 * @NoRepositoryBean：具象リポジトリではないためスキャン対象外に設定
 */
@NoRepositoryBean
public interface ViewBaseRepository<T extends ViewBaseEntity> extends JpaRepository<T, String> {

    String MSG_PREFIX = "Viewは読み取り専用のため、";
    String MSG_SUFFIX = "を実行できません。";

    /**
     * 保存操作禁止：Viewは読み取り専用
     */
    @Override
    default <S extends T> S save(S entity) {
        throw new UnsupportedOperationException(MSG_PREFIX + "保存操作" + MSG_SUFFIX);
    }

    /**
     * 一括保存操作禁止
     */
    @Override
    default <S extends T> List<S> saveAll(Iterable<S> entities) {
        throw new UnsupportedOperationException(MSG_PREFIX + "一括保存操作" + MSG_SUFFIX);
    }

    /**
     * 削除操作禁止
     */
    @Override
    default void delete(T entity) {
        throw new UnsupportedOperationException(MSG_PREFIX + "削除操作" + MSG_SUFFIX);
    }

    /**
     * ID指定削除操作禁止
     */
    @Override
    default void deleteById(String id) {
        throw new UnsupportedOperationException(MSG_PREFIX + "ID指定削除操作" + MSG_SUFFIX);
    }

    /**
     * 一括削除操作禁止
     */
    @Override
    default void deleteAll() {
        throw new UnsupportedOperationException(MSG_PREFIX + "一括削除操作" + MSG_SUFFIX);
    }

    @Override
    default void deleteAll(Iterable<? extends T> entities) {
        throw new UnsupportedOperationException(MSG_PREFIX + "複数削除操作" + MSG_SUFFIX);
    }
}